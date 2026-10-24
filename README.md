# Performance Hub (Fabric, Minecraft 1.21.11)

Klientský mod: profily podle hardwaru (Slabé / Střední / Silné PC) a přehledné nastavení výkonu
v jednom minimalistickém GUI. Otevře se klávesou **Right Shift** ve hře (změna v Ovládání).

Sekce: Profily, Video, Svět, Entity, Částice, HUD, Pokročilé.
Mod pouze nastavuje vanilla možnosti (vzdálenost renderu/simulace, FPS limit, mipmapy, částice,
entity, mraky, grafika...). Žádné prvky HUD nevypíná.

Původní nastavení se před prvním zásahem zálohuje a jde obnovit (Profily > Obnovit původní).
Při úplně prvním spuštění se použije profil doporučený podle detekovaného HW (jde vypnout v Pokročilé).

## Jak získat .jar (GitHub Actions)
1. Vytvoř na GitHubu nový repozitář.
2. Nahraj do něj celý obsah této složky včetně skryté složky `.github/workflows/build.yml`.
   (Na PC: Add file > Upload files a přetáhni složky. Na telefonu: "Add file > Create new file" a do názvu
   napiš celou cestu, např. `src/main/java/cz/perfhub/PerfScreen.java`; lomítka vytvoří složky.)
3. Po nahrání se automaticky spustí build (záložka **Actions**).
4. Hotový jar najdeš v **Releases > nejnovější build** nebo v Actions > poslední běh > Artifacts.
5. Dej ho do `.minecraft/mods` spolu s Fabric API 0.141.1+1.21.11 (a Fabric Loaderem 0.18.4+).

## Když build spadne
Zkopíruj mi chybovou hlášku z Actions (červený krok "Build"). Nejčastější příčina je změněný
název metody ve vanilla třídách 1.21.11 - oprava je jednořádková.
