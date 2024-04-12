import { AxiosInstance } from "axios";
import { defaultInstance } from "./Api";

const QuranService = (api: AxiosInstance = defaultInstance) => ({
  getAyahById: async (ayahId) => {
    try {
      const response = await api.get(`ayah/${ayahId}/en.asad`);
      return response.data;
    } catch (error) {
      console.error("Error accured");
    }
  },
});

export default QuranService;
