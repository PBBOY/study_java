import axios from 'axios';
const USER_API_TEST = "/valueById"

const USER_API_GETALL = "/getAll"
const USER_API_CREATE = "/create"
const USER_API_INSERT = "/insert"
const USER_API_UPDATE = "/update"
const USER_API_DELETE = "/delete"
const USER_API_DELETEALL = "/deleteAll"

const USER_API_GETTREEALL = "/getTreeAll"

const BASE_URL = "http://localhost:8080"

class ApiService {
    fetchGetAll() {
        return axios.get(USER_API_GETALL)
    }

    fetchGetTreeAll(){
        return axios.get(USER_API_GETTREEALL)
    }

    fetchCreate(userId){
        return axios.get(USER_API_TEST + '/' + userId)
    }

    fetchInsert() {

    }

    fetchUpdate() {

    }

    fetchDelete() {

    }

    fetchDeleteAll(){

    }
}

export default new ApiService();