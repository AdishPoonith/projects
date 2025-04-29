.class public Lg5/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/ConcurrentMap;
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

.field private c:Lg5/u$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/u$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field private d:Lr5/a;


# direct methods
.method private constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lg5/u$b;->b:Ljava/util/concurrent/ConcurrentMap;

    iput-object p1, p0, Lg5/u$b;->a:Ljava/lang/Class;

    sget-object p1, Lr5/a;->b:Lr5/a;

    iput-object p1, p0, Lg5/u$b;->d:Lr5/a;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Lg5/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg5/u$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method private c(Ljava/lang/Object;Lt5/c0$c;Z)Lg5/u$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lt5/c0$c;",
            "Z)",
            "Lg5/u$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lt5/c0$c;->V()Lt5/z;

    move-result-object v0

    sget-object v1, Lt5/z;->l:Lt5/z;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lg5/u$b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1, p2, v0}, Lg5/u;->a(Ljava/lang/Object;Lt5/c0$c;Ljava/util/concurrent/ConcurrentMap;)Lg5/u$c;

    move-result-object p1

    if-eqz p3, :cond_1

    iget-object p2, p0, Lg5/u$b;->c:Lg5/u$c;

    if-nez p2, :cond_0

    iput-object p1, p0, Lg5/u$b;->c:Lg5/u$c;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "you cannot set two primary primitives"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object p0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "only ENABLED key is allowed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addPrimitive cannot be called after build"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lt5/c0$c;)Lg5/u$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lt5/c0$c;",
            ")",
            "Lg5/u$b<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lg5/u$b;->c(Ljava/lang/Object;Lt5/c0$c;Z)Lg5/u$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;Lt5/c0$c;)Lg5/u$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lt5/c0$c;",
            ")",
            "Lg5/u$b<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lg5/u$b;->c(Ljava/lang/Object;Lt5/c0$c;Z)Lg5/u$b;

    move-result-object p1

    return-object p1
.end method

.method public d()Lg5/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/u<",
            "TP;>;"
        }
    .end annotation

    iget-object v1, p0, Lg5/u$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_0

    new-instance v6, Lg5/u;

    iget-object v2, p0, Lg5/u$b;->c:Lg5/u$c;

    iget-object v3, p0, Lg5/u$b;->d:Lr5/a;

    iget-object v4, p0, Lg5/u$b;->a:Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lg5/u;-><init>(Ljava/util/concurrent/ConcurrentMap;Lg5/u$c;Lr5/a;Ljava/lang/Class;Lg5/u$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lg5/u$b;->b:Ljava/util/concurrent/ConcurrentMap;

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "build cannot be called twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lr5/a;)Lg5/u$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr5/a;",
            ")",
            "Lg5/u$b<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lg5/u$b;->d:Lr5/a;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
