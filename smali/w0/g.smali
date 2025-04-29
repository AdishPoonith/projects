.class public final synthetic Lw0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lw0/h;

.field public final synthetic k:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lw0/h;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/g;->j:Lw0/h;

    iput-object p2, p0, Lw0/g;->k:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw0/g;->j:Lw0/h;

    iget-object v1, p0, Lw0/g;->k:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lw0/h;->a(Lw0/h;Ljava/lang/Runnable;)V

    return-void
.end method
