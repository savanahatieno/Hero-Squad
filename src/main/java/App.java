import jdk.internal.access.JavaSecurityAccess;
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

        // Main Page
        get("/", (request, response) ->{
            return new ModelAndView(new HashMap(), "main.hbs");
        } , new HandlebarsTemplateEngine());

        //Nav Section
        get("/nav", (request, response) ->{
            return new ModelAndView(new HashMap(), "nav.hbs");
        } , new HandlebarsTemplateEngine());

        //Hero Page
        get("/hero_page", (request, response) ->{
            return new ModelAndView(new HashMap(), "hero_page.hbs");
        } , new HandlebarsTemplateEngine());

        //Hero Form Page
        get("/hero_form", (request, response) ->{
            return new ModelAndView(new HashMap(), "hero_form.hbs");
        } , new HandlebarsTemplateEngine());

        //Squad Page
        get("/squad_page", (request, response) ->{
            return new ModelAndView(new HashMap(), "squad_page.hbs");
        } , new HandlebarsTemplateEngine());

        //Squad Form page

        get("/squad_form", (request, response) ->{
            return new ModelAndView(new HashMap(), "squad_form.hbs");
        } , new HandlebarsTemplateEngine());






//        Squad Page
//
//        get("/squad_page", (request, response) ->{
//            ArrayList<squad> squad = models.squad.getInstances();
//            JavaSecurityAccess.ProtectionDomainCache model;
//            model.put("squad", squad);
//            ArrayList<hero> members = hero.getInstances();
//            model.put("hero", "members");
//            squad newSquad = squad.findBySquadId(1);
//            model.put("allSquadMembers", newSquad.getSquadMembers();
//            return new ModelAndView(new HashMap(), "squad_page.hbs");
//        } , new HandlebarsTemplateEngine());









        //Squad Form Page
        get("/squad_form", (request, response) ->{
            return new ModelAndView(new HashMap(), "squad_form.hbs");
        } , new HandlebarsTemplateEngine());

        //Success Page
        get("/success_page", (request, response) ->{
            return new ModelAndView(new HashMap(), "success_page.hbs");
        } , new HandlebarsTemplateEngine());

        //Post


//        post("/new/hero", ((request, response) -> {
//            String name = request.queryParams("name");
//            Integer age = Integer.parseInt(request.queryParams("age"));
//            String power = request.queryParams("power");
//            String weakness = request.queryParams("weakness");
//            request.session().attribute("item", name);
//            model.put("item",req.session().attribute("item"));
//            model.put("newHero",newHero);
//            return new ModelAndView(model, "success_page.hbs");
//        }, new HandlebarsTemplateEngine());
    }
}