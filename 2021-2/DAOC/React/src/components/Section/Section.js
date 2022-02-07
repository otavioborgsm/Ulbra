import React from "react";
import {
    Switch, Route
} from 'react-router-dom'
import About from "../About";
import Contact from "../Contact";
import Home from "../Home";
import Products from "../Products";
import ContactView from "../admin/ContactView";
import Login from "../admin/Login";
import HomeAdm from '../admin/Home'
import './Section.css'
import { isAdmin } from "../../Auth";
import ContactResponse from "../admin/ContactResponse";
import ClientView from "../admin/ClientView";
import ClientAdd from "../admin/ClientAdd";
import ClientUpdate from "../admin/ClientUpdate";

function Section() {
    return(
        <section id="section">
            <div  className="container">
            <br/>

                <Switch>

                    <Route exact path="/">
                        <Home />
                    </Route>

                    <Route path="/about">
                        <About />
                    </Route>

                    <Route path="/products">
                        <Products />
                    </Route>

                    <Route exact path="/contact">
                        <Contact />
                    </Route>

                    <Route exact path="/user/login">
                        <Login />
                    </Route>

                    <PrivateRoute exact path="/admin/contact/view" component={ContactView}></PrivateRoute>

                    <PrivateRoute exact path="/admin/client/view" component={ClientView}></PrivateRoute>
                    <PrivateRoute exact path="/admin/client/add" component={ClientAdd}></PrivateRoute>
                    <PrivateRoute exact path="/admin/client/update/:idClient" component={ClientUpdate}></PrivateRoute>

                    <PrivateRoute exact path="/admin/home" component={HomeAdm}></PrivateRoute>

                    <PrivateRoute exact path="/admin/contact/response/:idContact" component={ContactResponse}></PrivateRoute>

                </Switch>

            </div>
        </section>
    );
}

export default Section;

const PrivateRoute = ({component: Component, ...rest}) => {
    return (

        <Route {...rest} render={props => (
            isAdmin() ?
                <Component {...props} />
            : console.log("não logado")
        )} />
    );
};