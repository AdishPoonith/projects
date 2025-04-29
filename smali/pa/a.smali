.class public final Lpa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/g;


# instance fields
.field public final j:Ljava/lang/Throwable;

.field private final synthetic k:Lv9/g;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lv9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpa/a;->j:Ljava/lang/Throwable;

    iput-object p2, p0, Lpa/a;->k:Lv9/g;

    return-void
.end method


# virtual methods
.method public N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lpa/a;->k:Lv9/g;

    invoke-interface {v0, p1, p2}, Lv9/g;->N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lv9/g$c;)Lv9/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lv9/g$b;",
            ">(",
            "Lv9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    iget-object v0, p0, Lpa/a;->k:Lv9/g;

    invoke-interface {v0, p1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public f0(Lv9/g$c;)Lv9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g$c<",
            "*>;)",
            "Lv9/g;"
        }
    .end annotation

    iget-object v0, p0, Lpa/a;->k:Lv9/g;

    invoke-interface {v0, p1}, Lv9/g;->f0(Lv9/g$c;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public r(Lv9/g;)Lv9/g;
    .locals 1

    iget-object v0, p0, Lpa/a;->k:Lv9/g;

    invoke-interface {v0, p1}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1
.end method
