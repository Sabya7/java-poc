//package com.sabya.javapoc;
//
//Design an application which helps multiple users to play snake and ladder game together
//
//        Played over network
//        Single dice
//        Max 6 users - each user have some unique symbol
//        Start from the beginning
//        No undo
//
//        Board length is fixed
//
//        Board
//
//        Players
//
//        Dice
//
//        Game
//        Board
//        Players
//        Dice
//        lasMove
//        currentPosition Of players
//
//        User
//        Name
//        Email
//
//        Board
//        Snakes[]
//        Ladders[]
//
//        Players
//        User id
//        Current Position
//
//        Dice
//        randInt(6);
//
//        Snakes
//        startPos
//        EndPos
//
//
//
//        Ladder
//        Start position
//        endPostition
//
//
//
//        Client  -> Instantiate a game instance
//        -> createGame<List Users>
//
//GameRequestDto
//        Map<Users, Symbol>
//
//Player
//        Symbol
//
//        GameController
//        createGame(GameRequestDTO) {
//        userService.createPlayers(users) - set of players
//        gameService.initiate(list<players>)
//        }
//
//        GameService
//        Initiate(players) {
//        New Board();
//        }
//
//        Board {
//        snakeMap<startPos, endPos>
//LadderMap<startPos, endPOs>
//
//
//Board{} {
//        initialize Snakes from config
//        initialize ladders from config
//        Cells = new int[100];
//        }
//
//
//
//
//
//
//
//
//        Game
//        Board
//        Players[]
//        Dice
//        lastMove
//        currentPositions<player, cell>
//Winner
//
//        move() {
//
//        }
//
//
//        Game{
//        last Move is players.length-1
//
//        }
//        }
//
//        Initiated the game
//        nextMove()
//        lastMove
//        currentPosition - where to maintain this?
//        Validation - whether it has reached the end
//        Snakes and ladders starting pos
//
//
//
//
//        Driver {
//
//        initiateNewGameWithPlayers(Map<Users, symbol>) : new Game / Game Not Created
//        }
//
//        GameController{
//        initi(map<Users,symbol>)
//
//        }
//        UserService {
//        validateUsers()
//        createPlayers(map<Users,symbol>)
//        }
//
//        Player {
//        userID
//        symbol
//        }
//        GameService {
//        -createBoard()
//        -startGame()
//
//        }
//
//        Dice{
//        getRandomInt()
//        }
//
//        Game
//        Board
//        Players[]
//        Dice
//        lastMove
//        currentPositions<player, cell>
//Winner
//
//        -rollDice()
//        - move() - snake and ladders thing
//        - checkIfWon()
//        }
//
//        Board {
//        checkIfLandedOnSnakeAndReturnEndtPos()
//        checkIfLandedOnLadderAndEndPos()
//        }
//
//        SUBMIT
//
//
//
//
//
//
//
//
//
//
//
//
//
