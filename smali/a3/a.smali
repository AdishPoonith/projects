.class public final La3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La3/h;La3/g;)Lo3/j0$a;
    .locals 1
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

    new-instance v0, La3/j;

    invoke-direct {v0, p1, p2}, La3/j;-><init>(La3/h;La3/g;)V

    return-object v0
.end method

.method public b()Lo3/j0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo3/j0$a<",
            "La3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, La3/j;

    invoke-direct {v0}, La3/j;-><init>()V

    return-object v0
.end method
