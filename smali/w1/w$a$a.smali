.class final Lw1/w$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/w$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lw1/w;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lw1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/w$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lw1/w$a$a;->b:Lw1/w;

    return-void
.end method
