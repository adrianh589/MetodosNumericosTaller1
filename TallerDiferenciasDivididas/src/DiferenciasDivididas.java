import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DiferenciasDivididas {

    static SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");

    //[Epoch Unix, Precio]
    static private final String[][] puntos = {
            {   "01/05/2015", "290"    },//Punto # 1
            {   "01/05/2016", "820"    },//Punto # 2
            {   "01/05/2017", "950"    },//Punto # 3
            {   "01/09/2017", "4700"   },//Punto # 4
            {   "01/01/2018", "20000"  },//Punto # 5
            {   "01/01/2019", "3500"   },//Punto # 6
            {   "01/09/2019", "11500"  },//Punto # 7
            {   "01/05/2020", "5300"   },//Punto # 8
            {   "01/09/2020", "13000"  },//Punto # 9
            {   "01/01/2021", "38000"  },//Punto # 10
            {   "01/05/2021", "62000"  },//Punto # 11
    };

    /**
     * Funcion para convertir una fecha a epoch
     * @param fecha Recibe la fecha en String
     */
    public static String convertirEpoch(String fecha) throws ParseException {
        return String.valueOf(sdf.parse(fecha).getTime() / 1000L);
    }

    /**
     * Funcion para convertir los puntos a formato Epoch
     */
    public static void puntosEpoch() throws ParseException {
        for (int i = 0; i < puntos.length; i++)
            puntos[i][0] = convertirEpoch(puntos[i][0]);
        System.out.println(Arrays.deepToString(puntos));
    }

}
