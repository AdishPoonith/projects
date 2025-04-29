.class public final Lg5/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/u$b;,
        Lg5/u$d;,
        Lg5/u$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lg5/u$d;",
            "Ljava/util/List<",
            "Lg5/u$c<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field private b:Lg5/u$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/u$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field private final d:Lr5/a;

.field private final e:Z


# direct methods
.method private constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lg5/u$c;Lr5/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lg5/u$d;",
            "Ljava/util/List<",
            "Lg5/u$c<",
            "TP;>;>;>;",
            "Lg5/u$c<",
            "TP;>;",
            "Lr5/a;",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/u;->a:Ljava/util/concurrent/ConcurrentMap;

    iput-object p2, p0, Lg5/u;->b:Lg5/u$c;

    iput-object p4, p0, Lg5/u;->c:Ljava/lang/Class;

    iput-object p3, p0, Lg5/u;->d:Lr5/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg5/u;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lg5/u$c;Lr5/a;Ljava/lang/Class;Lg5/u$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lg5/u;-><init>(Ljava/util/concurrent/ConcurrentMap;Lg5/u$c;Lr5/a;Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic a(Ljava/lang/Object;Lt5/c0$c;Ljava/util/concurrent/ConcurrentMap;)Lg5/u$c;
    .locals 0

    invoke-static {p0, p1, p2}, Lg5/u;->b(Ljava/lang/Object;Lt5/c0$c;Ljava/util/concurrent/ConcurrentMap;)Lg5/u$c;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/Object;Lt5/c0$c;Ljava/util/concurrent/ConcurrentMap;)Lg5/u$c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(TP;",
            "Lt5/c0$c;",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lg5/u$d;",
            "Ljava/util/List<",
            "Lg5/u$c<",
            "TP;>;>;>;)",
            "Lg5/u$c<",
            "TP;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lt5/c0$c;->T()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lt5/c0$c;->U()Lt5/i0;

    move-result-object v1

    sget-object v2, Lt5/i0;->n:Lt5/i0;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    move-object v0, v3

    :cond_0
    invoke-static {}, Lo5/h;->a()Lo5/h;

    move-result-object v1

    invoke-virtual {p1}, Lt5/c0$c;->S()Lt5/y;

    move-result-object v2

    invoke-virtual {v2}, Lt5/y;->T()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lt5/c0$c;->S()Lt5/y;

    move-result-object v4

    invoke-virtual {v4}, Lt5/y;->U()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v4

    invoke-virtual {p1}, Lt5/c0$c;->S()Lt5/y;

    move-result-object v5

    invoke-virtual {v5}, Lt5/y;->S()Lt5/y$c;

    move-result-object v5

    invoke-virtual {p1}, Lt5/c0$c;->U()Lt5/i0;

    move-result-object v6

    invoke-static {v2, v4, v5, v6, v0}, Lo5/l;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lt5/y$c;Lt5/i0;Ljava/lang/Integer;)Lo5/l;

    move-result-object v0

    invoke-static {}, Lg5/e;->a()Lg5/x;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lo5/h;->c(Lo5/l;Lg5/x;)Lg5/f;

    move-result-object v10

    new-instance v0, Lg5/u$c;

    invoke-static {p1}, Lg5/c;->a(Lt5/c0$c;)[B

    move-result-object v6

    invoke-virtual {p1}, Lt5/c0$c;->V()Lt5/z;

    move-result-object v7

    invoke-virtual {p1}, Lt5/c0$c;->U()Lt5/i0;

    move-result-object v8

    invoke-virtual {p1}, Lt5/c0$c;->T()I

    move-result v9

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, Lg5/u$c;-><init>(Ljava/lang/Object;[BLt5/z;Lt5/i0;ILg5/f;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lg5/u$d;

    invoke-virtual {v0}, Lg5/u$c;->a()[B

    move-result-object v1

    invoke-direct {p1, v1, v3}, Lg5/u$d;-><init>([BLg5/u$a;)V

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static j(Ljava/lang/Class;)Lg5/u$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)",
            "Lg5/u$b<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lg5/u$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg5/u$b;-><init>(Ljava/lang/Class;Lg5/u$a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Lg5/u$c<",
            "TP;>;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public d()Lr5/a;
    .locals 1

    iget-object v0, p0, Lg5/u;->d:Lr5/a;

    return-object v0
.end method

.method public e()Lg5/u$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/u$c<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u;->b:Lg5/u$c;

    return-object v0
.end method

.method public f([B)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lg5/u$c<",
            "TP;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lg5/u$d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lg5/u$d;-><init>([BLg5/u$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg5/u$c<",
            "TP;>;>;"
        }
    .end annotation

    sget-object v0, Lg5/c;->a:[B

    invoke-virtual {p0, v0}, Lg5/u;->f([B)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lg5/u;->d:Lr5/a;

    invoke-virtual {v0}, Lr5/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
