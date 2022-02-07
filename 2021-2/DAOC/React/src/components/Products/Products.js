import React, { useEffect, useState } from "react";
import { Switch, Route, useRouteMatch, useParams, Link} from "react-router-dom";
import Api from "../../Api";
import './Product.css'

function Products() {
    
    let {path, url} = useRouteMatch();

    return(
        <div className="row">
            <div className="col-sm-1"></div>
            <div className="col-sm-10">
                <h1>Página de produtos</h1>
                <ul>
                    <li><Link to={`${url}/1`}>Categoria 1</Link></li>
                    <li><Link to={`${url}/2`}>Categoria 2</Link></li>
                    <li><Link to={`${url}/3`}>Categoria 3</Link></li>
                </ul>
                <Switch>
                    <Route exact path={path}>
                        <AllCategory />
                    </Route>
                    <Route path={`${path}/:catId`}>
                        <Category />
                    </Route>
                </Switch>
            </div>
            <div className="col-sm-1"></div>
        </div>
    );
}

export default Products;

function AllCategory() {
    const[products, setProducts] = useState([]);

    useEffect(()=>{
        Api.get('/products')
            .then((response)=>{
                setProducts(response.data)
            });
    }, []);

    return(
        <>
            <h1>Todos os produtos</h1>
            <table className="table table-striped">
                <thead>
                    <th>Nome</th>
                    <th>Preço</th>
                    <th>Descrição</th>
                </thead>
                <tbody>
                    {products.map((product, index)=>
                        <tr key={index} >
                            <td>{product.name}</td>
                            <td>{product.price}</td>
                            <td>{product.description}</td>
                        </tr>
                    )}
                </tbody>
            </table>
        </>
    );


}


function Category() {
    let {catId} = useParams();
    const[products, setProducts] = useState([]);

    useEffect(()=>{
        Api.get(`/products/category/${catId}`)
            .then((response)=>{
                setProducts(response.data)
            })
    },[catId]);

    return(
        <>
            <h1>Categoria {catId} foi selecionada</h1>
            <table className="table table-striped">
                <thead>
                    <th>Nome</th>
                    <th>Preço</th>
                    <th>Descrição</th>
                </thead>
                <tbody>
                    {products.map((product, index)=>
                        <tr key={index} >
                            <td>{product.name}</td>
                            <td>{product.price}</td>
                            <td>{product.description}</td>
                        </tr>
                    )}
                </tbody>
            </table>
        </>
    );
}