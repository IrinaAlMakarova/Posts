import org.junit.Test

import org.junit.Assert.*
import ru.netology.Comments
import ru.netology.Likes
import ru.netology.Post

class WallServiceTest {

    @Test
    fun update() {
        // создаём целевой сервис
        val service = ru.netology.WallService
        // заполняем несколькими постами
        service.add(
            Post(
                1,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        )
        service.add(
            Post(
                2,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        )
        service.add(
            Post(
                3,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        )
        // создаём информацию об обновлении
        val update = Post(
            1,
            1,
            1,
            2,
            1234,
            "Text1",
            3,
            4,
            1,
            "Ist",
            "post",
            13,
            1,
            true,
            1,
            1,
            true,
            false,
            14,
            Comments(),
            Likes()
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun update1() {
        // создаём целевой сервис
        val service = ru.netology.WallService
        // заполняем несколькими постами
        service.add(
            Post(
                5,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        )
        service.add(
            Post(
                6,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        )
        service.add(
            Post(
                7,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        )
        // создаём информацию об обновлении
        val update = Post(
            4,
            1,
            1,
            2,
            1234,
            "Text1",
            3,
            4,
            1,
            "Ist",
            "post",
            13,
            1,
            true,
            1,
            1,
            true,
            false,
            14,
            Comments(),
            Likes()
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test
    fun add() {
        // создаём целевой сервис
        val service = ru.netology.WallService
        // заполняем несколькими постами
        val result = service.add(
            Post(
                7,
                1,
                1,
                2,
                1234,
                "Text",
                3,
                4,
                1,
                "Ist",
                "post",
                13,
                1,
                true,
                1,
                1,
                true,
                false,
                14,
                Comments(),
                Likes()
            )
        ).id

        assertEquals(1, result)
    }
}