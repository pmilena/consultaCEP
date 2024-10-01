import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class SalvaJson {
    public void SalvaJson(Endereco endereco) throws IOException {
        FileWriter writer = new FileWriter(endereco.cep() + ".json");
        writer.write(new GsonBuilder().setPrettyPrinting().create().toJson(endereco));
        writer.close();
    }
}
