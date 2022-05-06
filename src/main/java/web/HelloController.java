package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/* @Controller: defines that our class is a controller
   @GetMapping: defines a method that should be invoked when a GET request is received for the specified URI
   @ResponseBody: tells Spring that whatever is returned from this method should be the body of our response */

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }
}

/* ################################################################################# */

/* @PathVariable
Spring allows us to use path variables, that is, dynamic additions to the path of a request.
Here is an example of a method which uses a path variable: */

@Controller
public class HelloController {
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
   /* By adding @PathVariable in front of the String name parameter,
    we let Spring know that the value of {name}
    (our actual path variable) from @GetMapping("/hello/{name}")
    should be mapped to our annotated method parameter. */

   /* {name} is variable because it can change. We can make a request to /hello/Laura
    or /hello/Bob. Our sayHello() method will treat both names the same! */

}

/* ################################################################################# */


  /* Notice that we can also use annotations in the definition of method parameters.

        If the path variable we are looking for is not a string, we can simply define
        the parameter with a different type

        For example, an int: */
  public class HelloController {
      @GetMapping("/increment/{number}")
      @ResponseBody
      public String addOne(@PathVariable int number) {
          return number + " plus one is " + (number + 1) + "!";
      }
  }
      /*  Making a request to /increment/10 would result in addOne() returning:

        "10 plus one is 11!" */
