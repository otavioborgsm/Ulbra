import React from "react";
import {useForm} from 'react-hook-form';
import { getToken } from "../../../Auth";
import Api from "../../../Api";
import {useHistory} from 'react-router-dom'

function ClientAdd() {
    
    const {handleSubmit, register} = useForm()
    const history = useHistory();


    const onSubmit = (data)=> {
        Api.post(
            '/clients',
            {
                name : data.name,
                email : data.email,
                phone : data.phone,
                address : data.address
            },
            {
                headres : {
                    Authorization : 'Bearer ' + getToken()
                }
            }
          )
          .then((response)=>{
            console.log(response.data);
          })
          .catch((errors)=>{
              console.log(errors);
          })
          .finally(()=>{  
              history.push('/admin/client/view');
          })
    }

    return(
        <div className="row">
            <div className="col-sm-1"></div>
            <div className="col-sm-10">
                <h1>Adicionando Cliente</h1>
                <form onSubmit={handleSubmit(onSubmit)}>
                    <div className="form-group">
                        <label>Nome:</label>
                        <input 
                            {...register("name")}
                            className="form-control" 
                            type="text"
                        />
                    </div>
                    <div className="form-group">
                        <label>E-mail:</label>
                        <input
                            {...register("email")} 
                            className="form-control" 
                            type="email" 
                        />
                    </div>
                    <div className="form-group">
                        <label>Telefone:</label>
                        <input
                            {...register("phone")} 
                            className="form-control" 
                            type="phone" 
                        />
                    </div>
                    <div className="form-group">
                        <label>Endereço</label>
                        <input
                            {...register("address")} 
                            className="form-control" 
                            type="address" 
                        />
                    </div>
                    <button type="submit" className="btn">Enviar</button>
                    <br/><br/>
                </form>
            </div>
            <div className="col-sm-1"></div>
        </div>
    );
}

export default ClientAdd;