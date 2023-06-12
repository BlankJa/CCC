#include <iostream>
#include <map>

std::map<int, int> create_snakes() {
    std::map<int, int> snakes;
    snakes[54] = 19;
    snakes[90] = 48;
    snakes[99] = 77;
    return snakes;
}

std::map<int, int> create_ladders() {
    std::map<int, int> ladders;
    ladders[9] = 34;
    ladders[40] = 64;
    ladders[67] = 86;
    return ladders;
}

int move_piece(int current_position, int dice_roll) {
    int final_position = current_position + dice_roll;

    std::map<int, int> snakes = create_snakes();
    std::map<int, int> ladders = create_ladders();

    if (snakes.find(final_position) != snakes.end()) {
        final_position = snakes[final_position];
    } else if (ladders.find(final_position) != ladders.end()) {
        final_position = ladders[final_position];
    }

    return final_position;
}

int main() {
    int position = 1;

    while (true) {
        int dice_roll;
        std::cin >> dice_roll;

        if (dice_roll == 0) {
            std::cout << "You Quit!" << std::endl;
            break;
        }

        if (2 <= dice_roll && dice_roll <= 12) {
            int new_position = move_piece(position, dice_roll);

            if (new_position <= 100) {
                position = new_position;
                std::cout << "You are now on square " << position << std::endl;

                if (position == 100) {
                    std::cout << "You Win!" << std::endl;
                    break;
                }
            } else {
                std::cout << "You are now on square " << position << std::endl;
            }
        }
    }

    return 0;
}
