.class public final synthetic Lj6/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/o1;


# direct methods
.method public synthetic constructor <init>(Lj6/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/n1;->j:Lj6/o1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj6/n1;->j:Lj6/o1;

    invoke-static {v0}, Lj6/o1;->c(Lj6/o1;)V

    return-void
.end method
