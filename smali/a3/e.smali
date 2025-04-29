.class public final La3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/k;


# instance fields
.field private final a:La3/k;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La3/k;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La3/k;",
            "Ljava/util/List<",
            "Lt2/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/e;->a:La3/k;

    iput-object p2, p0, La3/e;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(La3/h;La3/g;)Lo3/j0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La3/h;",
            "La3/g;",
            ")",
            "Lo3/j0$a<",
            "La3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt2/b;

    iget-object v1, p0, La3/e;->a:La3/k;

    invoke-interface {v1, p1, p2}, La3/k;->a(La3/h;La3/g;)Lo3/j0$a;

    move-result-object p1

    iget-object p2, p0, La3/e;->b:Ljava/util/List;

    invoke-direct {v0, p1, p2}, Lt2/b;-><init>(Lo3/j0$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b()Lo3/j0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo3/j0$a<",
            "La3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt2/b;

    iget-object v1, p0, La3/e;->a:La3/k;

    invoke-interface {v1}, La3/k;->b()Lo3/j0$a;

    move-result-object v1

    iget-object v2, p0, La3/e;->b:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lt2/b;-><init>(Lo3/j0$a;Ljava/util/List;)V

    return-object v0
.end method
