.class final Ls1/x0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/f2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ls1/y3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ls1/y3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/x0$e;->a:Ljava/lang/Object;

    iput-object p2, p0, Ls1/x0$e;->b:Ls1/y3;

    return-void
.end method

.method static synthetic c(Ls1/x0$e;Ls1/y3;)Ls1/y3;
    .locals 0

    iput-object p1, p0, Ls1/x0$e;->b:Ls1/y3;

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/x0$e;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Ls1/y3;
    .locals 1

    iget-object v0, p0, Ls1/x0$e;->b:Ls1/y3;

    return-object v0
.end method
