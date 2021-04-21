import models.hero;
import models.squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {

        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        }else {
            port = 4567;
        }
        port(port);

        staticFileLocation("/public");
        hero.setUpNewHero1();
        hero.setUpNewHero1();
        squad.setUpNewSquad1();
//        Squad.setUpNewSquad1();

        get("/nav", (request, response) ->{
            return new ModelAndView(new HashMap(), "nav.hbs");
        } , new HandlebarsTemplateEngine());
    }
}