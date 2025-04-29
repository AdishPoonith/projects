.class public final Lo5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/o$c;,
        Lo5/o$d;,
        Lo5/o$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo5/o$d;",
            "Lo5/c<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo5/o$c;",
            "Lo5/b<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo5/o$d;",
            "Lo5/j<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo5/o$c;",
            "Lo5/i<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo5/o$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lo5/o$b;->b(Lo5/o$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lo5/o;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lo5/o$b;->c(Lo5/o$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lo5/o;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lo5/o$b;->d(Lo5/o$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lo5/o;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lo5/o$b;->a(Lo5/o$b;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lo5/o;->d:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lo5/o$b;Lo5/o$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo5/o;-><init>(Lo5/o$b;)V

    return-void
.end method

.method static synthetic a(Lo5/o;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lo5/o;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic b(Lo5/o;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lo5/o;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic c(Lo5/o;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lo5/o;->c:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic d(Lo5/o;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lo5/o;->d:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public e(Lo5/n;Lg5/x;)Lg5/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lo5/n;",
            ">(TSerializationT;",
            "Lg5/x;",
            ")",
            "Lg5/f;"
        }
    .end annotation

    new-instance v0, Lo5/o$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1}, Lo5/n;->a()Lv5/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo5/o$c;-><init>(Ljava/lang/Class;Lv5/a;Lo5/o$a;)V

    iget-object v1, p0, Lo5/o;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lo5/o;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/b;

    invoke-virtual {v0, p1, p2}, Lo5/b;->d(Lo5/n;Lg5/x;)Lg5/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No Key Parser for requested key type "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " available"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
