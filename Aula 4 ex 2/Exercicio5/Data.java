package Exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    private GregorianCalendar gc;
    private Date date;
    SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");


    public Data(Date data) {
        this.date = data;
        this.gc = new GregorianCalendar();
        this.gc.setTime(data);
    }

    public Data(String data){
        try {
            this.gc = new GregorianCalendar();
            this.gc.setTime(formatar.parse(data));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getDate() {
        return date;
    }

    public void adicionarDia (){
        gc.add(Calendar.DAY_OF_MONTH,1);
        date = gc.getTime();
    }

    public boolean validar(String data) {
        try {
            LocalDate.parse(data,DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT));
            return true;

        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Data{" + formatar.format(date) + '}';
    }
}
