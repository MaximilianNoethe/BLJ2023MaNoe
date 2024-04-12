import axios, { AxiosInstance } from "axios";

export const defaultInstance: AxiosInstance = axios.create({
    baseURL: "http://api.alquran.cloud/v1/"
});
