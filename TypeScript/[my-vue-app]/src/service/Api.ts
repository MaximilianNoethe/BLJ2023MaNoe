import axios, { AxiosInstance } from "axios";

export const instance: AxiosInstance = axios.create({
    baseURL: 'https://api.thecatapi.com/v1/images'
});


