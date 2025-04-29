.class public Lv6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/i;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lv6/d;


# direct methods
.method constructor <init>(Ljava/util/Set;Lv6/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lv6/f;",
            ">;",
            "Lv6/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lv6/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lv6/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lv6/c;->b:Lv6/d;

    return-void
.end method

.method public static synthetic b(Lb6/e;)Lv6/i;
    .locals 0

    invoke-static {p0}, Lv6/c;->d(Lb6/e;)Lv6/i;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lb6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb6/c<",
            "Lv6/i;",
            ">;"
        }
    .end annotation

    const-class v0, Lv6/i;

    invoke-static {v0}, Lb6/c;->e(Ljava/lang/Class;)Lb6/c$b;

    move-result-object v0

    const-class v1, Lv6/f;

    invoke-static {v1}, Lb6/r;->m(Ljava/lang/Class;)Lb6/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v0

    sget-object v1, Lv6/b;->a:Lv6/b;

    invoke-virtual {v0, v1}, Lb6/c$b;->d(Lb6/h;)Lb6/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb6/c$b;->c()Lb6/c;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d(Lb6/e;)Lv6/i;
    .locals 2

    new-instance v0, Lv6/c;

    const-class v1, Lv6/f;

    invoke-interface {p0, v1}, Lb6/e;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Lv6/d;->a()Lv6/d;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lv6/c;-><init>(Ljava/util/Set;Lv6/d;)V

    return-object v0
.end method

.method private static e(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lv6/f;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/f;

    invoke-virtual {v1}, Lv6/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lv6/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lv6/c;->b:Lv6/d;

    invoke-virtual {v0}, Lv6/d;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/c;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lv6/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv6/c;->b:Lv6/d;

    invoke-virtual {v1}, Lv6/d;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Lv6/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
