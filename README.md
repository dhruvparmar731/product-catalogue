# product-catalogue

What are the things completed?

/{category_name} - GET API Endpoint added.
e.g. category_name: Pants, Socks, Caps, etc

write the name of category in path variable and get all list of products with asociated to category type and all the details.


http://localhost:8080/Pants


[
    {
        "id": 1,
        "categoryId": 2,
        "brand": "Zara",
        "price": "2000",
        "color": "Grey",
        "size": "30",
        "sku": "zaraG30pants"
    },
    {
        "id": 2,
        "categoryId": 2,
        "brand": "H&M",
        "price": "2400",
        "color": "Black",
        "size": "30",
        "sku": "HMB30pants"
    }
]


What are things can be achieved further?

Exceptional handling can be added using @ControllerAdvice and @ExceptionHandler.
Log can be added using @Slf4j and synced using Aspects files.
Addition of below Junit Test cases.

    develop test case for getProductDetails method,
      mock the findByCategoryType and findAllByCategoryId method and assert not null.
      2 test cases can be added for empty collection and for results.
    develop test cases for getProducts controller end point method.
      mock the path variable and service response and compare with HttpStatus.OK and HttpStatus.NO_CONTENT.
      

    
    
     




