
/**
 * This ensures that the jsdom test environment is being leveraged to help manage issues
 * with jest when attempting to run when access the DOM inside of the .js files
 * 
 * @jest-environment jsdom
 */

/**
 * Simply, importing the information within our Object.js file for testing
 */
const {user, returnUserObject} = require('./Objects.js')

/**
 * A basic test of the returnUserObject function to confirm it's returning the
 * appropriate object.
 */
test ('return User object test', () =>{
    expect(returnUserObject("test", "test")).toEqual({username: "test", password: "test"})
})
