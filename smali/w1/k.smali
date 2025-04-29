.class public final synthetic Lw1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lw1/g;


# direct methods
.method public synthetic constructor <init>(Lw1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/k;->j:Lw1/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw1/k;->j:Lw1/g;

    invoke-static {v0}, Lw1/h$h;->c(Lw1/g;)V

    return-void
.end method
