.class public final Le9/m$h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/m$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le9/m$h;
    .locals 2

    new-instance v0, Le9/m$h;

    invoke-direct {v0}, Le9/m$h;-><init>()V

    iget-object v1, p0, Le9/m$h$a;->a:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Le9/m$h;->e(Ljava/lang/Long;)V

    iget-object v1, p0, Le9/m$h$a;->b:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Le9/m$h;->d(Ljava/lang/Long;)V

    return-object v0
.end method

.method public b(Ljava/lang/Long;)Le9/m$h$a;
    .locals 0

    iput-object p1, p0, Le9/m$h$a;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public c(Ljava/lang/Long;)Le9/m$h$a;
    .locals 0

    iput-object p1, p0, Le9/m$h$a;->a:Ljava/lang/Long;

    return-object p0
.end method
