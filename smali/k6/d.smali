.class public Lk6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/d$b;,
        Lk6/d$a;
    }
.end annotation


# instance fields
.field private final a:Lk6/g;

.field private final b:Lk6/d$a;

.field private final c:Lk6/d$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk6/g;

    invoke-direct {v0}, Lk6/g;-><init>()V

    iput-object v0, p0, Lk6/d;->a:Lk6/g;

    new-instance v0, Lk6/d$a;

    invoke-direct {v0, p0}, Lk6/d$a;-><init>(Lk6/d;)V

    iput-object v0, p0, Lk6/d;->b:Lk6/d$a;

    new-instance v0, Lk6/d$b;

    invoke-direct {v0, p0}, Lk6/d$b;-><init>(Lk6/d;)V

    iput-object v0, p0, Lk6/d;->c:Lk6/d$b;

    return-void
.end method

.method static synthetic a(Lk6/d;)Lk6/g;
    .locals 0

    iget-object p0, p0, Lk6/d;->a:Lk6/g;

    return-object p0
.end method


# virtual methods
.method public b(Lm6/q$c$a;)Lk6/b;
    .locals 1

    sget-object v0, Lm6/q$c$a;->k:Lm6/q$c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lk6/d;->c:Lk6/d$b;

    return-object p1

    :cond_0
    iget-object p1, p0, Lk6/d;->b:Lk6/d$a;

    return-object p1
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lk6/d;->a:Lk6/g;

    invoke-virtual {v0}, Lk6/g;->a()[B

    move-result-object v0

    return-object v0
.end method

.method public d([B)V
    .locals 1

    iget-object v0, p0, Lk6/d;->a:Lk6/g;

    invoke-virtual {v0, p1}, Lk6/g;->c([B)V

    return-void
.end method
