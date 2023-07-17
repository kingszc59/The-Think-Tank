import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class TheThinkTank {

  constructor() { }

  public calculateTheThinkTank(inputValue: number): number {
    
    // Initialize the output and input variables
    let outputValue: number;
    let multiplier: number;

    if (inputValue === 0) {
      multiplier = 0;
    } else {
      // Calculate the multiplier based on the input value
      multiplier = inputValue * 0.05;
    }

    // Calculate the output value
    outputValue = inputValue + (inputValue * multiplier);

    // Return the output value
    return outputValue;
  }

  public getTheThinkTankScore(inputValue: number): string {
    
    // Get the output value
    let outputValue = this.calculateTheThinkTank(inputValue);

    // Initialize the output string
    let outputString = `The Think Tank score for ${inputValue} is ${outputValue}.`;

    // Return the output string
    return outputString;
  }

  public getTheThinkTankPercentage(inputValue: number): string {
    // Get the output value
    let outputValue = this.calculateTheThinkTank(inputValue);

    // Calculate the percentage
    let percentage = (outputValue - inputValue) / inputValue * 100;

    // Initialize the output string
    let outputString = `The Think Tank percentage for ${inputValue} is ${percentage}%.`;

    // Return the output string
    return outputString;
  }

}