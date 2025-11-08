[#ftl]

[@c.page "Kalendářové výpočty" /]
    <h1>Kalendářové výpočty</h1>
        <form class="px-5" action="/vypocet">
            <div class="row g-3 align-items-center">
                <div class="col-auto">
                    <label for="rok">Rok</label>
                </div>
                <div class="col-auto">
                    <input id="rok" name="rok" type="number" class="form-control" value="${year?c}" min="1900" max="2099">
                </div>
                <div class="col-auto">
                    <button class="btn btn-primary" type="submit" name="typ" value="easter">Velikonoce</button>
                </div>
                <div class="col-auto">
                    <button class="btn btn-primary" type="submit" name="typ" value="pentecost">Letnice</button>
                </div>
                <div class="col-auto">
                    <button class="btn btn-primary" type="submit" name="typ" value="christmas">Vánoce</button>
                </div>
                <div class="col-auto">
                    <button class="btn btn-primary" type="submit" name="typ" value="sylvester">Silvestr</button>
                </div>
            </div>
        </form>

[/@c.page]