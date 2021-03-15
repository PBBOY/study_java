import React, {Component} from 'react'
import ApiService from "../../ApiService"

class TreeItemComponent extends Component{
    constructor(props) {
        super(props)

        this.state = {
            treeItems:[
                {
                    id:0,
                    path:[],
                    content:"",
                    depth:0
                }
            ]  
        }
    }

    componentDidMount(){
        this.reloadTreeItems();
    }

    reloadTreeItems = () => {
        ApiService.fetchGetTreeAll().then(
            res => {
                this.setState({
                    treeItems: res.data
                })
            }
        )
    }

    render(){
        return(
            <div>
                <ul>
                    {this.state.treeItems.map((item) => 
                    {
                        const liStyle = {paddingLeft:item.depth *100};
                        return (
                            <li key={item.id} style={liStyle}> {item.content}</li>
                        )
                    }
                    )}
                </ul>
            </div>
        )
    }
}
export default TreeItemComponent;