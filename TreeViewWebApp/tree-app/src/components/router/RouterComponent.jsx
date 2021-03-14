import React from 'react';
import {BrowserRouter, Route, Switch} from 'react-router-dom'
import UserListComponent from "../UserListComponent";

const AppRouter = () => {
    return (
        <div>
            <BrowserRouter>
                <div style={style}>
                    <Switch>
                        <Route exact path="/" component={UserListComponent}/>
                        <Route path="/getAll" component={UserListComponent}/>
                    </Switch>
                </div>
            </BrowserRouter>
        </div>
    )
}

const style = {
    color:'red',
    margin:'10px'
}

export default AppRouter;