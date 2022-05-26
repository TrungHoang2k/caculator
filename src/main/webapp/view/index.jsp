<!DOCTYPE html>
<html>
<body>

<h1>Sandwich Condiments</h1>

<form action="/result" method="post" object="calculator">
    <table>
        <tr>
            <td>
                <input type = "text" name="x" style="border: 1px solid #333"/>
            </td>

            <td>
                <input type = "text" name="y" style="border: 1px solid #333"/>
            </td>

            <td>
                = ${result}
            </td>
        </tr>
    </table>
    <div style="display: flex">
        <input type="submit" name="action" value="Addition(+)">
        <input type="submit" name="action" value="Subtraction(-)">
        <input type="submit" name="action" value="Multiplication(X)">
        <input type="submit" name="action" value="Division(/)">
    </div>
</form>
</body>
</html>
