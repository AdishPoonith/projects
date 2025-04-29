.class public abstract Lv9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/g$b;


# instance fields
.field private final j:Lv9/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv9/g$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/a;->j:Lv9/g$c;

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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv9/g$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lv9/a;->j:Lv9/g$c;

    return-object v0
.end method

.method public r(Lv9/g;)Lv9/g;
    .locals 0

    invoke-static {p0, p1}, Lv9/g$b$a;->d(Lv9/g$b;Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1
.end method
