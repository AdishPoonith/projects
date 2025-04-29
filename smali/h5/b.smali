.class public Lh5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh5/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg5/v<",
        "Lg5/a;",
        "Lg5/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lh5/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lh5/b;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lh5/b;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static e()V
    .locals 1

    new-instance v0, Lh5/b;

    invoke-direct {v0}, Lh5/b;-><init>()V

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
            "Lg5/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lg5/a;

    return-object v0
.end method

.method public bridge synthetic b(Lg5/u;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/b;->f(Lg5/u;)Lg5/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lg5/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lg5/a;

    return-object v0
.end method

.method public f(Lg5/u;)Lg5/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/u<",
            "Lg5/a;",
            ">;)",
            "Lg5/a;"
        }
    .end annotation

    new-instance v0, Lh5/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lh5/b$b;-><init>(Lg5/u;Lh5/b$a;)V

    return-object v0
.end method
