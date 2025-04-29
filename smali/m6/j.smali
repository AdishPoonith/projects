.class public Lm6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ld6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/c<",
            "Lm6/l;",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lm6/l;->b()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v0}, Ld6/c$a;->c(Ljava/util/Comparator;)Ld6/c;

    move-result-object v0

    sput-object v0, Lm6/j;->a:Ld6/c;

    return-void
.end method

.method public static a()Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm6/j;->a:Ld6/c;

    return-object v0
.end method

.method public static b()Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/s;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm6/j;->a:Ld6/c;

    return-object v0
.end method

.method public static c()Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/w;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm6/j;->a:Ld6/c;

    return-object v0
.end method
