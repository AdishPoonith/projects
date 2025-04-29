.class public Lr6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lb6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb6/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lr6/h$a;

    invoke-direct {v0}, Lr6/h$a;-><init>()V

    const-class v1, Lr6/g;

    invoke-static {v0, v1}, Lb6/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lb6/c;

    move-result-object v0

    return-object v0
.end method
