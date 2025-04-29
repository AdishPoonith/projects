.class public Lm5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm5/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/v<",
        "Lg5/d;",
        "Lg5/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lm5/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lm5/c;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lm5/c;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static e()V
    .locals 1

    new-instance v0, Lm5/c;

    invoke-direct {v0}, Lm5/c;-><init>()V

    invoke-static {v0}, Lg5/w;->m(Lg5/v;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lg5/d;",
            ">;"
        }
    .end annotation

    const-class v0, Lg5/d;

    return-object v0
.end method

.method public bridge synthetic b(Lg5/u;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lm5/c;->f(Lg5/u;)Lg5/d;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lg5/d;",
            ">;"
        }
    .end annotation

    const-class v0, Lg5/d;

    return-object v0
.end method

.method public f(Lg5/u;)Lg5/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/u<",
            "Lg5/d;",
            ">;)",
            "Lg5/d;"
        }
    .end annotation

    new-instance v0, Lm5/c$a;

    invoke-direct {v0, p1}, Lm5/c$a;-><init>(Lg5/u;)V

    return-object v0
.end method
