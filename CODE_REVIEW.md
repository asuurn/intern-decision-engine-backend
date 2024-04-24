# Code review

- The variables and classes are named logically and are easy to understand.
- The exceptions have variety and are used as needed.
- Decision class could have been converted into a record as it is immutable.
- Javadoc for classes and methods is concise and helps with understandability.
- Workload is divided between methods to avoid so-called spaghetti code, which helps with understandability.
- In the frontend code, the loan period slider has an incorrect lower barrier attached to it. The minimum period is 
12 months, but the label says 6 months.
- The tests are extensive and have nice line coverage.
- The credit_modifier logic does not match with the example given in the task file, but as there were no further instructions in the file, I presume it's okay.
- The credit score is not actually calculated and not compared to 1 as the task file suggests, but the logic is the similar, so I presume it's okay.


## Biggest shortcoming

I think the biggest shortcoming is that the loan amount calculated in the backend decision was not correctly presented 
in the frontend. The task states as such: "The idea of the decision engine is to determine what would be the maximum 
sum, regardless of the person requested loan amount. For example, if a person applies for €4000, but we determine that 
we would approve a larger sum, then the result should be the maximum sum which we would approve." That would mean if 
the person's credit score was 1000, then every approved loan amount would be €10,000 regardless of the input loan 
amount from the user. Currently, the approved loan amount was according to the slider's position. The changes were done 
in the _submitForm() in the loan_form.dart.

