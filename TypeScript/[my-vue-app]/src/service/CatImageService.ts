import { AxiosInstance } from "axios";
import { instance } from "./Api";

const CatImageService = (api: AxiosInstance = instance) => ({
    getRandomCatImage: async () => {
        const data = await api.get('search');
        return data['data'][0]['url'];
    }
});

export default CatImageService;