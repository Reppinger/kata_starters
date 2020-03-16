require('../src/string_calculator');

describe('String Calculator', function (){
    describe('add', function() {
       it('behaves thusly with given input', function(){
       	  calculator = new StringCalculator();
          result = calculator.add("");
          expect(result).toBe(0);
       });
    });

});
