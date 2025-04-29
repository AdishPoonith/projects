.class Lg5/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/i;->b(Lo5/d;)Lg5/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo5/d;


# direct methods
.method constructor <init>(Lo5/d;)V
    .locals 0

    iput-object p1, p0, Lg5/i$a;->a:Lo5/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lg5/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TQ;>;)",
            "Lg5/g<",
            "TQ;>;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Lg5/h;

    iget-object v1, p0, Lg5/i$a;->a:Lo5/d;

    invoke-direct {v0, v1, p1}, Lg5/h;-><init>(Lo5/d;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Primitive type not supported"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b()Lg5/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/g<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lg5/h;

    iget-object v1, p0, Lg5/i$a;->a:Lo5/d;

    invoke-virtual {v1}, Lo5/d;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lg5/h;-><init>(Lo5/d;Ljava/lang/Class;)V

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/i$a;->a:Lo5/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/i$a;->a:Lo5/d;

    invoke-virtual {v0}, Lo5/d;->i()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
