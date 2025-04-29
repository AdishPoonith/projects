.class final Lla/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/g$b;
.implements Lv9/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv9/g$b;",
        "Lv9/g$c<",
        "Lla/a3;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lla/a3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lla/a3;

    invoke-direct {v0}, Lla/a3;-><init>()V

    sput-object v0, Lla/a3;->j:Lla/a3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lda/p<",
            "-TR;-",
            "Lv9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv9/g$b$a;->a(Lv9/g$b;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lv9/g$c;)Lv9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lv9/g$b;",
            ">(",
            "Lv9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv9/g$b$a;->b(Lv9/g$b;Lv9/g$c;)Lv9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public f0(Lv9/g$c;)Lv9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g$c<",
            "*>;)",
            "Lv9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv9/g$b$a;->c(Lv9/g$b;Lv9/g$c;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lv9/g$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv9/g$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public r(Lv9/g;)Lv9/g;
    .locals 0

    invoke-static {p0, p1}, Lv9/g$b$a;->d(Lv9/g$b;Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1
.end method
