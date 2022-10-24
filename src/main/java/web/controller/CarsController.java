package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServise;
import web.servise.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    CarServiseImpl carServus = new CarServiseImpl();
    @GetMapping(value = "/cars") // Выполняем запрос на сервер;
    public String printWelcome(ModelMap model,
                               @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = carServus.getCars(count);
        model.addAttribute("carss", cars); // Добаление атрибута в модель с именем "carss";
        return "cars"; // Название файла HTML
    }
}
