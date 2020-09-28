for (int z = dots; z > 0; z--) {
    x[z] = x[(z - 1)];
    y[z] = y[(z - 1)];
}

//This code moves the joints up the chain.

if (leftDirection) {
    x[0] -= DOT_SIZE;
}

//In the checkCollision() method, we determine if the snake has hit itself or one of the walls.

for (int z = dots; z > 0; z--) {

    if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
        inGame = false;
    }
}
//If the snake hits one of its joints with its head the game is over.

if (y[0] >= B_HEIGHT) {
    inGame = false;
}
