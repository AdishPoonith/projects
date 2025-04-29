.class Ll6/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll6/t0$a;
    }
.end annotation


# instance fields
.field private final a:Ll6/t0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll6/t0$a;

    invoke-direct {v0}, Ll6/t0$a;-><init>()V

    iput-object v0, p0, Ll6/t0;->a:Ll6/t0$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lm6/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/t0;->a:Ll6/t0$a;

    invoke-virtual {v0, p1}, Ll6/t0$a;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm6/q;)V
    .locals 0

    return-void
.end method

.method public c(Lj6/g1;)Lm6/q$a;
    .locals 0

    sget-object p1, Lm6/q$a;->j:Lm6/q$a;

    return-object p1
.end method

.method public d(Lm6/q;)V
    .locals 0

    return-void
.end method

.method public e(Ljava/lang/String;)Lm6/q$a;
    .locals 0

    sget-object p1, Lm6/q$a;->j:Lm6/q$a;

    return-object p1
.end method

.method public f(Lj6/g1;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/g1;",
            ")",
            "Ljava/util/List<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Lm6/u;)V
    .locals 1

    iget-object v0, p0, Ll6/t0;->a:Ll6/t0$a;

    invoke-virtual {v0, p1}, Ll6/t0$a;->a(Lm6/u;)Z

    return-void
.end method

.method public h(Ljava/lang/String;Lm6/q$a;)V
    .locals 0

    return-void
.end method

.method public i(Ld6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public j(Lj6/g1;)Ll6/l$a;
    .locals 0

    sget-object p1, Ll6/l$a;->j:Ll6/l$a;

    return-object p1
.end method

.method public k()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lm6/q;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public start()V
    .locals 0

    return-void
.end method
