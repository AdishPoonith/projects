.class final Lk9/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/h1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lk9/f;


# direct methods
.method private constructor <init>(Lk9/f;)V
    .locals 0

    iput-object p1, p0, Lk9/f$e;->a:Lk9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lk9/f;Lk9/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lk9/f$e;-><init>(Lk9/f;)V

    return-void
.end method


# virtual methods
.method public a()Lio/grpc/internal/t;
    .locals 1

    iget-object v0, p0, Lk9/f$e;->a:Lk9/f;

    invoke-virtual {v0}, Lk9/f;->f()Lk9/f$f;

    move-result-object v0

    return-object v0
.end method
