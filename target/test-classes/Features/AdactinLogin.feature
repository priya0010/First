Feature: Validation of order number in Adactin web application

Scenario Outline: AD02_Validation of order number with mutliple valid credentials
Given User launch Adactin web application
When  User enters valid "<username>" and  "<password>"
And   User clicks Login Button
Then  User verify Search Hotel is displayed
When User selects valid "<location>","<hotels>","<roomtype>","<number of rooms>",enters "<check in date>","<check out date>"and selects "<adult per room>","<children per room>" 
And  User clicks Search Button
Then User verify Select Hotel is displayed
When  User clicks Radio Button
When  User clicks Continue Button
Then User Verify Book A Hotel is displayed
When User enters valid "<first name>","<last name>","<billing address>","<Credit card number>",selects valid "<Credit card type>","<Expiry Month>","<Expiry Year>" and enters"<CVV number>"
And  User clicks Book Now Button
Then User verify Order No is displayed

Examples:
|username|password|location|hotels|roomtype|number of rooms|check in date|check out date|adult per room|children per room|first name|last name|billing address|Credit card number|Credit card type|Expiry Month|Expiry Year|CVV number|
|priyad123|C8BWM0|London|Hotel Creek|Standard|2 - Two|17/06/2022|24/06/2022|2 - Two|0 - None|Priya|D|Mumbai|1563247896542365|American Express|April|2022|123|
|priyad123|C8BWM0|Sydney|Hotel Sunshine|Double|3 - Three|18/06/2022|25/06/2022|1 - One|1 - One|Ramu|E|Delhi|1563247896589365|VISA|May|2021|189|
|priyad123|C8BWM0|Melbourne|Hotel Hervey|Deluxe|4 - Four|19/06/2022|26/06/2022|2 - Two|2 - Two|Mohan|R|Chennai|1563247236542365|Master Card|June|2020|132|
|priyad123|C8BWM0|Paris|Hotel Creek|Deluxe|1 - One|20/06/2022|27/06/2022|3 - Three|3 - Three|Arjun|V|Bangalore|1563245696542365|American Express|July|2019|121|
|priyad123|C8BWM0|Adelaide|Hotel Cornice|Standard|2 - Two|21/06/2022|28/06/2022|4 - Four|4 - Four|Vishal|S|Simla|1563247896842365|Other|August|2020|122|
