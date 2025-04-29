.class public final synthetic Lj6/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/p0;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/i0;->j:Lj6/p0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj6/i0;->j:Lj6/p0;

    invoke-static {v0}, Lj6/p0;->c(Lj6/p0;)V

    return-void
.end method
