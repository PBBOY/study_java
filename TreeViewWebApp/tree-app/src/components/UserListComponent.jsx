import React, { Component } from "react";
import ApiService from "../ApiService";

class UserListComponent extends Component{
    constructor(props){
        super(props);

        this.state = {
            users:[],
            message: null
        }
    }

    componentDidMount(){
        this.reloadUserList();
    }

    reloadUserList = () => {
        ApiService.fetchGetAll().then(
            res => {
                console.timeLog()
                this.setState({
                    users : res.data
                })
            }
        ).catch(err => {
            console.log("reloadUserList Err", err);
        })
    }

    render(){
        return (
            <div>
                <h2>User List</h2>
                <table>
                <thead>
                    <tr>
                        
                        <th>Id</th>
                        <th>user Name</th>
                        <th>Age</th>
                    
                    </tr>
                </thead>
                <tbody>
                    {this.state.users.map(user => 
                    <tr key={user.id}>
                        <td>{user.userName}</td>
                        <td>{user.age}</td>
                    </tr>
                    )}
                </tbody>
                </table>
            </div>
        )
    }
}

export default UserListComponent;
