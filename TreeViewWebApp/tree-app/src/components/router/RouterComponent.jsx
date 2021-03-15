import React from 'react';
import {BrowserRouter, Route, Switch} from 'react-router-dom'
import TreeItemComponent from '../treeItemComponent/TreeItemComponent';
import UserListComponent from "../userListComponent/UserListComponent";

const AppRouter = () => {
    return (
        <div>
            <BrowserRouter>
                <div style={style}>
                    <Switch>
                        <Route exact path="/" component={UserListComponent}/>
                        <Route path="/getAll" component={UserListComponent}/>
                        <Route path="/getTreeAll" component={TreeItemComponent}/>
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